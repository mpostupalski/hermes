--CREATE SEQUENCE partnership_seq START WITH 1;

CREATE TABLE sfrm_partnership
(
  partnership_seq int DEFAULT 1,
  partnership_id varchar(50) NOT NULL,
  description varchar(200),
  partner_endpoint varchar(200) NOT NULL,
  partner_cert_fingerprint varchar(200),
  is_hostname_verified boolean DEFAULT FALSE,
  sign_algorithm varchar(200),
  encrypt_algorithm varchar(200),
  retry_max int DEFAULT 3,
  retry_interval int DEFAULT 30000,
  is_disabled boolean DEFAULT FALSE NOT NULL,  
  created_timestamp timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL,
  modified_timestamp timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL,
  UNIQUE (partnership_id),
  PRIMARY KEY (partnership_seq)
);
