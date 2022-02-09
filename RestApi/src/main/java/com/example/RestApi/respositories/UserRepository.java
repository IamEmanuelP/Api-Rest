package com.example.RestApi.respositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.RestApi.models.UserModel;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long> {
}
