package com.xworkz.autoservices.service;

import com.xworkz.autoservices.entity.AutoservicesEntity;
import com.xworkz.autoservices.exception.InvalidLocation;

public interface ValidateAutoservice {
	public boolean validateAndSave(AutoservicesEntity entity) throws InvalidLocation;

}
