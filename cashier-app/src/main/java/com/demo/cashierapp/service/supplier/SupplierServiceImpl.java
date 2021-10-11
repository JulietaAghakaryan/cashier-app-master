package com.demo.cashierapp.service.supplier;

import com.demo.cashierapp.entity.Supplier;
import com.demo.cashierapp.entity.User;
import com.demo.cashierapp.repository.SupplierRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SupplierServiceImpl implements SupplierService {

    private final SupplierRepository supplierRepository;

    @Override
    public Supplier save(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    @Override
    public ResponseEntity<Supplier> getById(Long id) {
        Optional<Supplier> supplier = supplierRepository.findById(id);

        return supplier.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(new Supplier(), HttpStatus.NOT_FOUND));
    }

    @Override
    public List<Supplier> getAll() {
        return (List<Supplier>) supplierRepository.findAll();
    }

    @Override
    public void delete(Supplier supplier) {
        supplierRepository.delete(supplier);
    }

    @Override
    public void deleteById(Long id) {
        supplierRepository.deleteById(id);
    }

    @Override
    public Supplier getSupplierByUsername(String username) {
        return supplierRepository.findSupplierByUsername(username);
    }
}
