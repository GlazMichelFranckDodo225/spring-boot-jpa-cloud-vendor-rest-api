package com.dgmf.controller;

import com.dgmf.dto.CloudVendorDTO;
import com.dgmf.model.CloudVendor;
import com.dgmf.service.CloudVendorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/cloudvendor")
@RequiredArgsConstructor
public class CloudVendorController {
    private final CloudVendorService cloudVendorService;

    @GetMapping("/{vendorid}")
    public CloudVendorDTO getCloudVendorDetails(
            @PathVariable("vendorid") String vendorid,
            @RequestParam("id") Long id) {
        return cloudVendorService.getCloudVendorDetails(id);
    }

    @PostMapping
    public CloudVendorDTO createCloudVendor(
            @RequestBody CloudVendorDTO cloudVendorDTO) {
        return cloudVendorService.createCloudVendor(cloudVendorDTO);
    }
}
