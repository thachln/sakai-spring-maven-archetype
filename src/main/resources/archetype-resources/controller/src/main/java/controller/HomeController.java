#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * Licensed to MKS Group under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * MKS Group licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a
 * copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package ${package}.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import lombok.Getter;
import lombok.Setter;
import ${package}.logic.SakaiProxy;
import ${package}.logic.ProjectLogic;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
    final static protected Log LOG = LogFactory.getLog(HomeController.class);

    @Setter
    @Getter
    private SakaiProxy sakaiProxy = null;

    @Setter
    @Getter
    private ProjectLogic projectLogic = null;
	   /**
     * This method is called when binding the HTTP parameter to bean (or model).
     * 
     * @param binder
     */
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        // Sample init of Custom Editor

//        Class<List<ItemKine>> collectionType = (Class<List<ItemKine>>)(Class<?>)List.class;
//        PropertyEditor orderNoteEditor = new MotionRuleEditor(collectionType);
//        binder.registerCustomEditor((Class<List<ItemKine>>)(Class<?>)List.class, orderNoteEditor);

    }
    
	/**
	 * Simply selects the home view to render by returning its name.
     * @return 
	 */
	@RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
	public ModelAndView displayHome() {
		ModelAndView mav = new ModelAndView("home");

		
		mav.addObject("currentSiteId", sakaiProxy.getCurrentSiteId());
		mav.addObject("userDisplayName", sakaiProxy.getCurrentUserDisplayName());
		
		mav.addObject("items", projectLogic.getItems());
		

		return mav;
	}
}
