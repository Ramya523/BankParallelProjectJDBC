package com.cg.bank.dao;

import com.cg.bank.model.CustomerDetails;

public interface UserEntryDao {
	int register(CustomerDetails cd);
	CustomerDetails login(int id,String password);
}
