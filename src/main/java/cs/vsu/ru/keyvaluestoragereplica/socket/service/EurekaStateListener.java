package cs.vsu.ru.keyvaluestoragereplica.socket.service;

//import com.netflix.appinfo.InstanceInfo;
//import com.netflix.discovery.EurekaClient;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.netflix.eureka.server.event.*;
//import org.springframework.context.event.EventListener;
//import org.springframework.stereotype.Component;

//@Component
//public class EurekaStateListener {
//
//    private final static Logger logger = LoggerFactory.getLogger(EurekaStateListener.class);
//
//    @EventListener
//    public void listen(EurekaInstanceCanceledEvent event) {
//        logger.info("Service {} has offline", event.getAppName());
//        logger.info("Server address information {}", event.getServerId());
//        //TODO sends an email
//    }
//
////    @EventListener
////    public void listen(EurekaInstanceRegisteredEvent event) {
////        InstanceInfo instanceInfo = event.getInstanceInfo();
////        logger.info("Services {}", instanceinfo.getAppname () + instanceInfo.getHostName () + "+ instanceInfo.getipaddr () +" " instanceInfo.getPort());
////    }
////
////    @EventListener
////    public void listen(EurekaInstanceRenewedEvent event) {
////        logger.info("Service {} Renewal", Event.getServerId () "" + " event.getAppName());
////    }
//
//    @EventListener
//    public void listen(EurekaRegistryAvailableEvent event) {
//        logger.info("Registration Center starts, {}", System.currentTimeMillis());
//    }
//
//    @EventListener
//    public void listen(EurekaServerStartedEvent event) {
//        logger.info("Registration Center Service Launch, {}", System.currentTimeMillis());
//    }
//
//}