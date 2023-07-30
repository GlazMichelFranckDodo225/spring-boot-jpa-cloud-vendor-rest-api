package com.dgmf.service.impl;

import com.dgmf.dto.CloudVendorDTO;
import com.dgmf.model.CloudVendor;
import com.dgmf.repository.CloudVendorRepository;
import com.dgmf.service.CloudVendorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CloudVendorServiceImpl implements CloudVendorService {
    private final CloudVendorRepository cloudVendorRepository;
    @Override
    public CloudVendorDTO getCloudVendorDetails(Long id) {
        CloudVendor cloudVendor = cloudVendorRepository.findById(id).get();
        CloudVendorDTO cloudVendorDTO = new CloudVendorDTO();
        BeanUtils.copyProperties(cloudVendor, cloudVendorDTO);

        return cloudVendorDTO;
    }

    @Override
    public CloudVendorDTO createCloudVendor(CloudVendorDTO cloudVendorDTO) {
        CloudVendor cloudVendor = new CloudVendor();
        BeanUtils.copyProperties(cloudVendorDTO, cloudVendor);
        cloudVendorRepository.save(cloudVendor);

        return cloudVendorDTO;
    }
}
