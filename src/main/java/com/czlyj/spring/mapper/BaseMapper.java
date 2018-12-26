package com.czlyj.spring.mapper;


import java.util.List;

public interface BaseMapper<T> {

    List<T> findAll();

    T find(int id);

    T update(T t);

    boolean delete(int id);

    boolean insert(T t);

    int count();
}
