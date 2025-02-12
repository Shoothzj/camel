/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.quartz;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class QuartzComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        QuartzComponent target = (QuartzComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autostartscheduler":
        case "autoStartScheduler": target.setAutoStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "enablejmx":
        case "enableJmx": target.setEnableJmx(property(camelContext, boolean.class, value)); return true;
        case "interruptjobsonshutdown":
        case "interruptJobsOnShutdown": target.setInterruptJobsOnShutdown(property(camelContext, boolean.class, value)); return true;
        case "prefixinstancename":
        case "prefixInstanceName": target.setPrefixInstanceName(property(camelContext, boolean.class, value)); return true;
        case "prefixjobnamewithendpointid":
        case "prefixJobNameWithEndpointId": target.setPrefixJobNameWithEndpointId(property(camelContext, boolean.class, value)); return true;
        case "properties": target.setProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "propertiesfile":
        case "propertiesFile": target.setPropertiesFile(property(camelContext, java.lang.String.class, value)); return true;
        case "propertiesref":
        case "propertiesRef": target.setPropertiesRef(property(camelContext, java.lang.String.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, org.quartz.Scheduler.class, value)); return true;
        case "schedulerfactory":
        case "schedulerFactory": target.setSchedulerFactory(property(camelContext, org.quartz.SchedulerFactory.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autostartscheduler":
        case "autoStartScheduler": return boolean.class;
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "enablejmx":
        case "enableJmx": return boolean.class;
        case "interruptjobsonshutdown":
        case "interruptJobsOnShutdown": return boolean.class;
        case "prefixinstancename":
        case "prefixInstanceName": return boolean.class;
        case "prefixjobnamewithendpointid":
        case "prefixJobNameWithEndpointId": return boolean.class;
        case "properties": return java.util.Map.class;
        case "propertiesfile":
        case "propertiesFile": return java.lang.String.class;
        case "propertiesref":
        case "propertiesRef": return java.lang.String.class;
        case "scheduler": return org.quartz.Scheduler.class;
        case "schedulerfactory":
        case "schedulerFactory": return org.quartz.SchedulerFactory.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        QuartzComponent target = (QuartzComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autostartscheduler":
        case "autoStartScheduler": return target.isAutoStartScheduler();
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "enablejmx":
        case "enableJmx": return target.isEnableJmx();
        case "interruptjobsonshutdown":
        case "interruptJobsOnShutdown": return target.isInterruptJobsOnShutdown();
        case "prefixinstancename":
        case "prefixInstanceName": return target.isPrefixInstanceName();
        case "prefixjobnamewithendpointid":
        case "prefixJobNameWithEndpointId": return target.isPrefixJobNameWithEndpointId();
        case "properties": return target.getProperties();
        case "propertiesfile":
        case "propertiesFile": return target.getPropertiesFile();
        case "propertiesref":
        case "propertiesRef": return target.getPropertiesRef();
        case "scheduler": return target.getScheduler();
        case "schedulerfactory":
        case "schedulerFactory": return target.getSchedulerFactory();
        default: return null;
        }
    }
}

