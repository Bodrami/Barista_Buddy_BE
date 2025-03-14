package com.project.baristabuddy_be.menu.repository;

import org.springframework.stereotype.Repository;

import java.awt.*;
import java.util.List;

@Repository
public interface MenuRepository {

    List<Menu> findAllMenu(String menuName);

}
