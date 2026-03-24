@echo off
@set /p project=Nombre de la clase principal: 
@for %%i in (target\*.jar) do echo @java -cp "dependencies\mi-libreria-1.0.0.jar;%%i" %project% > run_prj.cmd
@echo @pause^>nul >> run_prj.cmd