package com.project.baristabuddy_be.menu.dto;

import com.project.baristabuddy_be.menu.aggregate.MENU_STATUS;
import com.project.baristabuddy_be.menu.aggregate.MENU_TYPE;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class MenuDTO {

    private int menuCode;
    private String menuName;
    private int menuOunce;
    private MENU_STATUS menuStatus;
    private MENU_TYPE menuType;
    private int menuPrice;
}
