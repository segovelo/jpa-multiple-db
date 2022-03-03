package com.segovelo.jpamultipledb.dao.user;

import org.springframework.data.jpa.repository.JpaRepository;
import com.segovelo.jpamultipledb.model.user.Possession;
/** 
* 3 Mar 2022 22:54:07
* @Javadoc TODO 
*
* @author Sebastian Vergara Losada  
* @param <Long>
**/

public interface PossessionRepository extends JpaRepository<Possession, Long> {

}
