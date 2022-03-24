package com.dohatec.limitservice.utils;

import org.springframework.util.SocketUtils;
import org.springframework.util.StringUtils;

public class Helper {
    public static void setRandomPort(int minPort, int maxPort) {
        try {
            String userDefinedPort = System.getProperty("server.port", System.getenv("SERVER_PORT"));
            System.out.println(userDefinedPort);
            if(userDefinedPort == null) {
                int port = SocketUtils.findAvailableTcpPort(minPort, maxPort);
                System.setProperty("server.port", String.valueOf(port));
            }
        } catch( IllegalStateException e) {
            System.out.println("No port is available");
        }
    }
}
