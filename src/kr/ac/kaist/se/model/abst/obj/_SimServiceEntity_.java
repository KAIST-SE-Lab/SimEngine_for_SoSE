package kr.ac.kaist.se.model.abst.obj;

/**
 * An abstract class to represent a service entity
 * ConstituentService is developed based on _SimServiceEntity_.
 * @author ymbaek
 */
public abstract class _SimServiceEntity_ extends _SimActionableEntity_{

    /** Service-specific attributes */
    protected String serviceProvider;
    protected String servicePublisher;

    /* GETTERS & SETTERS */

    public String getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public String getServicePublisher() {
        return servicePublisher;
    }

    public void setServicePublisher(String servicePublisher) {
        this.servicePublisher = servicePublisher;
    }
}
