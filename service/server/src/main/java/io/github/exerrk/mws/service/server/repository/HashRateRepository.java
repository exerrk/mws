package io.github.exerrk.mws.service.server.repository;

import io.github.exerrk.mws.service.core.entity.HashRateUnitEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Evan Sid (a.k.a exerrk)
 * created in 08.2017
 */
public interface HashRateRepository extends Repos<HashRateUnitEntity, Integer>  {
}
