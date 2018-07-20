package com.labkit.vidhya.iptocountry.cucumber.stepdefs;

import com.labkit.vidhya.iptocountry.IptocountryApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = IptocountryApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
