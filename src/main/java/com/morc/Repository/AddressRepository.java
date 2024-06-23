package com.morc.Repository;

import com.morc.model.addresses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<addresses,Long> {

}
