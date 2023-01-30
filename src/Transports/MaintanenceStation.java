package Transports;

import java.util.LinkedList;
import java.util.Queue;

public class MaintanenceStation {
    private Queue<Transport<?>> queue = new LinkedList<>();
    
    public void addTransport(Transport<?> transport) {
      if (transport instanceof Bus) {
          System.out.println("Автобусы не обслуживаются");
      }
      else queue.add(transport);
    }

    public void doingMaintrance() {
        Transport<?> transport = queue.poll();
        if (transport != null) {
            System.out.println("Требуется провести ТО " + transport.getBrand() + transport.getModel());
        }
    }

}
