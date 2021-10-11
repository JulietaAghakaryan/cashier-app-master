package com.demo.cashierapp.service.supplier;

import com.demo.cashierapp.entity.Supplier;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface SupplierService {

    Supplier save(Supplier user);

    ResponseEntity<Supplier> getById(Long id);

    List<Supplier> getAll();

    void delete(Supplier user);

    void deleteById(Long id);

    Supplier getSupplierByUsername(String username);
}
