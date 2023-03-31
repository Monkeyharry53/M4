package users;

public class Professor extends Person{
        private String credentials;

        Professor(String _firstName, String _lastName, String _credentials) {
            super(_firstName, _lastName);

            credentials = _credentials;
        }

        /**
         * Sets the professors credentials
         * 
         * @param _credentials String: the new credentials
         */
        public void setCredentials(String _credentials) {
            this.credentials = _credentials;
        }

        public void approveEnrollment() {
            //TODO: the whole function for approving enrollement. How is this going to work, what does the fucntion take?
        }

}
