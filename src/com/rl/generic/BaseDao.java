package com.rl.generic;

import java.util.List;

public interface BaseDao <T>{
  public void Save(T t);
  public T getT(Integer id);
  public List<T> listT();
}
