package com.jwebmp.plugins.globalize.cultures.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class GlobalizeModuleInclusions implements IGuiceScanModuleInclusions<GlobalizeModuleInclusions>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.globalize.cultures");
		return set;
	}
}
