package com.jyothsna.rest_demo.controller;

import com.jyothsna.rest_demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
    CloudVendor cloudvendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId) {

        return cloudvendor;
    }
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudvendor = cloudVendor;
        return "Cloud Vendor Created Successfully";
    }
    @PutMapping
    public String updateVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudvendor = cloudVendor;
        return "Cloud Vendor Updated Successfully";
    }
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId) {
        this.cloudvendor = null;
        return "Cloud Vendor deleted successfully";
    }
}
