package com.example.demoapi.service;import com.example.demoapi.dto.HtDto;import com.example.demoapi.model.HtModel;import java.util.List;import java.util.Optional;public interface HtService {	List<HtDto> getAll();	HtModel save(HtModel htModel);	void delete(Integer id);	Optional<HtModel> getById(Integer id);}