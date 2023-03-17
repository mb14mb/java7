package com.lab7;

import javax.transaction.Transactional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface MessageRepository extends PagingAndSortingRepository<Message, Integer>{

}
