package org.mest.cl;

import java.util.Date;

public class Status {
    private boolean isActive;
    private Date lastLogin;

    Status(){
        this.isActive = false;
        this.lastLogin = new Date();
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public boolean isActive() {
        return isActive;
    }
}
