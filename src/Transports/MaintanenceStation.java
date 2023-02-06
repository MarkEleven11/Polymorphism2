package Transports;

import MechanicsWorkers.Mechanics;

import java.util.*;

public class MaintanenceStation {
    private Queue<Transport> queue = new LinkedList<>();

    public void addTransport(Transport transport) {
      if (transport instanceof Bus) {
          System.out.println("Автобусы не обслуживаются");
      }
      else queue.add(transport);
    }

    public void doingMaintrance() {
        Transport transport = queue.poll();
        if (transport != null) {
            System.out.println("Требуется провести ТО " + transport.getBrand() + transport.getModel());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MaintanenceStation that = (MaintanenceStation) o;
        return Objects.equals(queue, that.queue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queue);
    }
}
