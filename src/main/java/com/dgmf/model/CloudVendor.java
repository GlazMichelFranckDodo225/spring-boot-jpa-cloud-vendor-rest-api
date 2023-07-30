package com.dgmf.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
@Table(name = "tbl_cloud_vendor")
public class CloudVendor {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long vendorId;
    public String vendorName;
    public String vendorAddress;
    public String vendorPhoneNumber;
}
