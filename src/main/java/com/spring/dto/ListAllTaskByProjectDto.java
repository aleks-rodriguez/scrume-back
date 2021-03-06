package com.spring.dto;

import java.util.List;

import com.spring.model.Team;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListAllTaskByProjectDto {
		
		private Integer id;
		
		private String name;
		
		private Team team;
		
		private String description;
		
		private List<TaskListDto> tasks;
		
}