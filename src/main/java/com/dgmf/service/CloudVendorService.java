package com.dgmf.service;

import com.dgmf.dto.CloudVendorDTO;
import com.dgmf.model.CloudVendor;

public interface CloudVendorService {
    CloudVendorDTO getCloudVendorDetails(Long id);

    CloudVendorDTO createCloudVendor(CloudVendorDTO cloudVendorDTO);
}
