/**
 * Copyright (c) 2013 The Regents of the University of California.
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 * 3. Neither the name of the University nor the names of its contributors
 *    may be used to endorse or promote products derived from this software
 *    without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 */


package edu.berkeley.path.model_objects.scenario;

public class ScenarioFactory {

    /**
     * Create an instance of Sensor Model Object
     * 
     * @return  Sensor Model Object
     */
	public Sensor createSensor() {
		return new Sensor();
	}

  /**
   * Create an instance of SensorSet Model Object
   *
   * @return  SensorSet Model Object
   */
  public SensorSet createSensorSet() {
    return new SensorSet();
  }

  /**
   * Create an instance of Density Model Object
   * @return  Density Model Object
   */
  public Density createDensity() {
    return new Density();
  }

  /**
   * Create an instance of InitialDensitySet Model Object
   *
   * @return  InitialDensitySet Model Object
   */
  public InitialDensitySet createInitialDensitySet() {
    return new InitialDensitySet();
  }

	   /**
     * Create an instance of DemandSet Model Object
     * 
     * @return  DemandSet Model Object 
     */
    public DemandSet createDemandSet() {
        return new DemandSet();
    }
    
    /**
     * Create an instance of DemandProfile Model Object
     * 
     * @return  DemandProfile Model Object 
     */
    public DemandProfile createDemandProfile() {
        return new DemandProfile();
    }
    
    
    /**
     * Create an instance of Demand Model Object
     * 
     * @return  Demand Model Object 
     */
    public Demand createDemand() {
        return new Demand();
    }

}
