package com.kodilla.patterns2.facade.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;

public class OrderDto {
    private List<ItemDto> items = new ArrayList<>();

    public void addItem(final ItemDto item) {
        items.add(item);
    }

    public List<ItemDto> getItems() {
        return items;
    }
}
