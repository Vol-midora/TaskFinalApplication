package com.crud.taskfinal.domain.TrelloCard;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Getter
public class TrelloTaskDto {

    private String name;
    private String description;
    private String pos;
    private String idList;

}
