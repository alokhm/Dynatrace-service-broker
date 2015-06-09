package com.covisint.cf.servicebroker.dynatrace.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Catalog holding list of services . 
 *
 * @version 1.0, 2015-06-01
 * @author Lingeshm
 *
 */

public final class Catalog {

    private volatile List<Service> services;

    private final Object monitor = new Object();

    List<Service> getServices() {
        synchronized (this.monitor) {
            return this.services;
        }
    }

    Service service() {
        synchronized (this.monitor) {
            if (this.services == null) {
                this.services = new ArrayList<>();
            }

            Service service = new Service(this);
            this.services.add(service);
            return service;
        }
    }

}
