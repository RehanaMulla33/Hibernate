package com.xworkz.State.dao;

import com.xworkz.State.entity.StateEntity;

public interface StateDAO {
	void create(StateEntity entity3);
	default StateEntity  getbyNameAndid(String name,int id) {
		return null;
		
	}
	
	
	default void updateById(String state,String capital,int id) {
		
	}
	default void deleteById(int id) {
		
	}


}
