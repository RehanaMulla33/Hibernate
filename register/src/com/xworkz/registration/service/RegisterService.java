package com.xworkz.registration.service;

import com.xworkz.registration.entity.RegisterEntity;

public interface RegisterService {
	boolean validateAndSave(RegisterEntity entity);

}
