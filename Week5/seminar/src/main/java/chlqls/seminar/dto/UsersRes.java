package chlqls.seminar.dto;

import chlqls.seminar.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class UsersRes {
    private List<User> users;
}