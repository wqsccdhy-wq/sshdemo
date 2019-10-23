package com.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @ClassName ClientInfo
 * @Description: TODO
 * @Author wq
 * @Date 2019-10-23
 * @Version V1.0
 **/
@Entity
@Table(name = "client_info", schema = "test")
public class ClientInfo {
    private long id;
    private String clientId;
    private String clientSecret;
    private String clientName;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "client_id")
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @Basic
    @Column(name = "client_secret")
    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    @Basic
    @Column(name = "client_name")
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

}
