package com.zfw.beans;

public class Group {
private String groupName;

public String getGroupName() {
	return groupName;
}

public void setGroupName(String groupName) {
	this.groupName = groupName;
}

@Override
public String toString() {
	return "Group [groupName=" + groupName + "]";
}

}
