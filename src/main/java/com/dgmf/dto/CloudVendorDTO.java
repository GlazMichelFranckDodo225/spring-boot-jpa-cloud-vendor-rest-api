package com.dgmf.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class CloudVendorDTO {
    public Long vendorId;
    public String vendorName;
    public String vendorAddress;
    public String vendorPhoneNumber;
}
