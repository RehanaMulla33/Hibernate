package com.xworkz.Country.dao;

import com.xworkz.Country.entity.CountryEntity;

public interface CountryDAO {
	void create(CountryEntity entity1);

	default CountryEntity getByName(int name) {
		return null;

	}

	default void updateById(String population, int id) {

	}

	default void deleteById(int id) {

	}

}
