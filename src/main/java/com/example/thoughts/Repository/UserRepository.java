package com.example.thoughts.Repository;

import com.example.thoughts.Entity.User;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, ObjectId> {
    Optional<User> findUserByName(@NonNull String name);
}
