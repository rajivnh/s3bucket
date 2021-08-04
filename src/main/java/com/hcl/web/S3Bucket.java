package com.hcl.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.Bucket;

@RestController
public class S3Bucket {
	@Autowired
	private AmazonS3Client s3Client;
	
	public S3Bucket() {
		
	}
	
	@GetMapping("/s3/list/buckets")
	public List<Bucket> listBuckets() {		
		return s3Client.listBuckets();
	}
}
