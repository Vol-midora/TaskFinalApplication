package com.crud.taskfinal.controller;

import com.crud.taskfinal.domain.TrelloCard.CreatedTrelloCard;
import com.crud.taskfinal.domain.TrelloBoardDto;
import com.crud.taskfinal.domain.TrelloCard.TrelloTaskDto;
import com.crud.taskfinal.trello.client.TrelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/trello")
public class TrelloController {

    @Autowired
    private TrelloClient trelloClient;

    @RequestMapping(method = RequestMethod.GET, value = "getTrelloBoards")
    public List<TrelloBoardDto> getTrelloBoards() {
        return trelloClient.getTrelloBoards();
    }

    @RequestMapping(method = RequestMethod.POST, value = "createTrelloCard")
    public CreatedTrelloCard createTrelloCard(@RequestBody TrelloTaskDto trelloTaskDto) {
        return trelloClient.createNewCard(trelloTaskDto);
    }

}
