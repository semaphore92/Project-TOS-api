package com.tos.toswpapi.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="test_member")
public class TestVo {

    @Id
    private String userId;

}
