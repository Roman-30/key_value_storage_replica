package cs.vsu.ru.keyvaluestoragereplica.socket.service;

import cs.vsu.ru.keyvaluestoragereplica.database.model.Database;
import cs.vsu.ru.keyvaluestoragereplica.socket.model.ConnectionConfig;
import cs.vsu.ru.keyvaluestoragereplica.socket.model.ConnectionModel;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.net.Socket;
import java.util.HashMap;
import java.util.Map;


@Data
@Service
public class Connection {
    public static Map<ServerSocket, Socket> serverList = new HashMap<>();
    public static Map<ConnectionModel, ClientService> clientList = new HashMap<>();
    private final Database database;
    private final ConnectionConfig connection = new ConnectionConfig(); // TODO: 27.04.2024
//    private final EurekaStateListener listener;
//    private ClientService client;
//    private final DynamicFeignClient dynamicFeignClient;

//    @Autowired
//    private EurekaClient eurekaClient;
//
//    public List<Application> getApplications() {
//        return eurekaClient.getApplications().getRegisteredApplications();
//    }

//    @Autowired
//    private ApplicationContext appContext;
////
//    @Autowired
//    private DynamicFeignClient dynamicFeignClient;

//    @Autowired
//    private EurekaClient eurekaClient;

//    @EventListener
//    public void onStatusChange(StatusChangeEvent event) {
//        System.out.println("+++++++++++++++++++++++++++++++");
//        System.out.println(event.isUp());

        //        InstanceInfo instance = event.;
//        String appName = instance.getAppName();
//        String instanceId = instance.getInstanceId();
//        String statusPageUrl = instance.getStatusPageUrl();
//        EurekaInstance.InstanceStatus currentStatus = instance.getStatus();
//        EurekaInstance.InstanceStatus previousStatus = event.getPreviousStatus();
//        event.getPreviousStatus();
//
//
//        if (currentStatus == EurekaInstance.InstanceStatus.UP && previousStatus == EurekaInstance.InstanceStatus.DOWN) {
//            // делаем что-то при восстановлении сервиса
//        } else if (currentStatus == EurekaInstance.InstanceStatus.DOWN && previousStatus == EurekaInstance.InstanceStatus.UP) {
//            // делаем что-то при отказе сервиса
//        } else if (currentStatus == EurekaInstance.InstanceStatus.STARTING) {
//            // делаем что-то при старте сервиса
//        }
        // ... другие действия в зависимости от статуса сервиса
//    }



    public void makeConnection() {
//        dynamicFeignClient.doCall("TESTCLIENT");

//        ConnectionModel ownConnection = connection.getStateConnectionModelMap()
//                .get(ShardState.MASTER);
//
//        InetAddress inetAddress;
//        try {
//            inetAddress = InetAddress.getByName(ownConnection.getAddress().getHost());
//        } catch (UnknownHostException e) {
//            throw new RuntimeException(e);
//        }
//        try (java.net.ServerSocket server = new java.net.ServerSocket(
//                ownConnection.getAddress().getPort(), connection.getShardCount(), inetAddress)
//        ) {
//            System.out.println("Server Started");
//
//            GlobalParam.isMaster = ownConnection.getShardState().getState();
//
//            final boolean[] flag = {true};
////            for (WebAddress address : connection.getShardAddresses()) {
//            for (Map.Entry<ShardState, ConnectionModel> address : connection.getStateConnectionModelMap().entrySet()) {
//                new Thread(() -> {
//                    while (flag[0]) {
//                        try {
//                            Thread.sleep(2000);
//                            ClientService client = new ClientService(
//                                    address.getValue().getAddress().getHost(),
//                                    address.getValue().getAddress().getPort(),
//                                    database
//                            );
//                            clientList.put(address.getValue(), client);
//                            flag[0] = false;
//                        } catch (Exception e) {
//                            flag[0] = true;
//                        }
//                    }
//                }).start();
//            }
//            while (true) {
//                Socket socket = server.accept();
//                try {
//                    serverList.put(new ServerSocket(socket), socket);
//                    InetSocketAddress sockaddr = (InetSocketAddress) socket.getRemoteSocketAddress();
//
//                    System.out.println("Соединение с :" + sockaddr.getPort() + " установлено");
//                } catch (IOException e) {
//                    socket.close();
//                    System.exit(0);
//                }
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
