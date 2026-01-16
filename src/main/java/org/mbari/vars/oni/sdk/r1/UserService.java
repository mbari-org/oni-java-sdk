package org.mbari.vars.oni.sdk.r1;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

import org.mbari.vars.oni.sdk.r1.models.User;

/**
 * @author Brian Schlining
 * @since 2017-06-08T16:20:00
 */
public interface UserService {

    CompletableFuture<List<User>> findAllUsers();

    CompletableFuture<User> create(User user);

    CompletableFuture<Optional<User>> update(User user);

    CompletableFuture<Optional<User>> findByUsername(String username);

    CompletableFuture<Optional<User>> changePassword(String user, String oldPassword, String newPassword);


}
