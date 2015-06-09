package org.cloudfoundary.covisint.servicebroker.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.net.URI;

import org.cloudfoundary.covisint.servicebroker.Credentials;

/**
 * Class: BindingResponse.java
 * Description: BindingResponse holding credentials , syslogDrainUrl. 
 *
 *@version 1.0, 2015-06-01
 *@author Lingeshm
 *
 */

  public final class BindingResponse {

    private final Credentials credentials;

    private final URI syslogDrainUrl;

    public BindingResponse(Credentials credentials, URI syslogDrainUrl) {
        this.credentials = credentials;
        this.syslogDrainUrl = syslogDrainUrl;
    }

    Credentials getCredentials() {
        return this.credentials;
    }

    @JsonProperty("syslog_drain_url")
    URI getSyslogDrainUrl() {
        return this.syslogDrainUrl;
    }

}
