package com.poc.vtinsighttool.controller;


import org.springframework.http.ResponseEntity;

public interface AdminController {

    public ResponseEntity<?> getBatchType();
    public ResponseEntity<?> saveBatchType();
    public ResponseEntity<?> updateBatchType();
}
