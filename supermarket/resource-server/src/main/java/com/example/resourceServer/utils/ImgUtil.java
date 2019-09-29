package com.example.resourceServer.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.UUID;

public class ImgUtil {
    private String getHost() throws SocketException {
        String host = null;
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        while (networkInterfaces.hasMoreElements()) {
            NetworkInterface networkInterface = networkInterfaces.nextElement();
            Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
            while (inetAddresses.hasMoreElements()) {
                InetAddress inetAddress = inetAddresses.nextElement();
                if (inetAddress.isLoopbackAddress()) {//回路地址，如127.0.0.1
//                    System.out.println("loop addr:" + inetAddress);
                } else if (inetAddress.isLinkLocalAddress()) {//169.254.x.x
//                    System.out.println("link addr:" + inetAddress);
                } else {
                    //非链接和回路真实ip
//                    System.out.println("ip:" + inetAddress);
                    host = inetAddress.toString();
                }
            }
        }
        return host;
    }

    {
        try {
            String hhost = getHost();
            if(hhost != null)
                host = hhost;
        } catch (SocketException e) {
            e.printStackTrace();
        }

        if(host == null)
            host = "10.21.94.183";
    }

    @Value("${my.host}")
    private static String host;

    private static String http = "http://";

    @Value("${server.port}")
    private static String port = "8000";

    public static String storeImage(MultipartFile file) throws IOException {
        String path = PathUtil.getImageDir();

        UUID uuid = UUID.randomUUID();
        String originalFilename = file.getOriginalFilename();
        String extendName = originalFilename.substring(originalFilename.lastIndexOf("."), originalFilename.length());
        String filename = uuid.toString() + extendName;

        File dir = new File(path, filename);
        file.transferTo(dir);

        String imgUrl = http + host +":" + port +"/imgs/" + filename;

        return imgUrl;
    }

}
